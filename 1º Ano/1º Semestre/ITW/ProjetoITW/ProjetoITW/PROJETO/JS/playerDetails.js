$(document).ready(function () {
    $('#backPlayer').click(function () {
        window.location.assign('players.html');
        console.log("ALERT: 123!!!");
    });

    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var playerInfoUri = 'http://192.168.160.28/football/api/players/';
        self.className = 'Player Detais';
        self.description = 'This page aims to demonstrate the use of the football web API for countries and the interconnection with other entities.<br>Called method(s): <ul><li>' + playerInfoUri + '</li></ul>';
        self.error = ko.observable();
        self.playerInfo = ko.observableArray([]);
        self.id = ko.observable();

        //-- Get the player ID
        var url = location.hash;
        self.id(url.split("#")[1]);
        console.log(self.id());

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
        self.getPlayerInfo = function () {
            console.log('CALL: getPlayerInfo...')
            ajaxHelper(playerInfoUri + self.id(), 'GET').done(function (data) {
                self.playerInfo(data);
                console.log(self.playerInfo());
            });
        };

        //---- initial call
        self.getPlayerInfo();
    }
    ko.applyBindings(new vm());

});