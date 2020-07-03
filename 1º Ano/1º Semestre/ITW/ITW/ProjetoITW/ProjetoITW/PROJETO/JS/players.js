$(document).ready(function () {
    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var playersUri = 'http://192.168.160.28/football/api/players';
        var searchPlayersUri = 'http://192.168.160.28/football/api/players/search?srcStr=';
        var playersCountUri = 'http://192.168.160.28/football/api/players/playersCount';
        self.searchPlayer = ko.observable("");
        self.playersCount = ko.observable(null);
        self.className = 'Search Players';
        self.description = 'This page aims to demonstrate the use of the football web API for countries and the interconnection with other entities.<br>Called method(s): <ul><li>' + playersUri + '</li></ul>';
        self.error = ko.observable();
        self.players = ko.observableArray([]);
        self.searchTextGood = ko.computed(function () {
            return (self.searchPlayer().length < 3);
        }, self);
        //--- Internal functions
        function ajaxHelper(uri, method, data) {
            self.error(''); // Clear error message
            return $.ajax({
                type: method,
                url: uri,
                dataType: 'json',
                contentType: 'application/json',
                data: data ? JSON.stringify(data) : null,
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log("AJAX Call[" + uri + "] Fail...");
                    self.error(errorThrown);
                }
            })
        }
        //--- Externel functions (accessible outside)
        self.getPlayers = function () {
            console.log('CALL: getPlayers...')
            ajaxHelper(playersUri, 'GET').done(function (data) {
                self.players(data);
            });
        };

        self.searchPlayers = function () {
            console.log('CALL: searchPlayers...')
            ajaxHelper(searchPlayersUri + self.searchPlayer(), 'GET').done(function (data) {
                self.players(data);
            });
        };
        clearPlayers = function () {
            self.getPlayers();
            self.searchPlayer("");
        };
        //---- initial call
        self.getPlayers();
    }
    ko.applyBindings(new vm());

});