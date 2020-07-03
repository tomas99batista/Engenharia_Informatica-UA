$(document).ready(function () {
    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var baseUri = 'http://192.168.160.28/football/api/teams';
        var searchTeamsUri = 'http://192.168.160.28/football/api/teams/search?srcStr=';
        var teamsCountUri = 'http://192.168.160.28/football/api/teams/teamsCount';
        self.searchTeam = ko.observable("");
        self.teamsCount = ko.observable(null);
        self.className = 'Search Teams';
        self.description = 'This page aims to demonstrate the use of the football web API for countries and the interconnection with other entities.<br>Called method(s): <ul><li>' + baseUri + '</li></ul>';
        self.error = ko.observable();
        self.teams = ko.observableArray([]);
        self.searchTextGood = ko.computed(function () {
            return (self.searchTeam().length < 3);
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
        self.getTeams = function () {
            console.log('CALL: getTeams...')
            ajaxHelper(baseUri, 'GET').done(function (data) {
                self.teams(data);
            });
        };

        self.searchTeams = function () {
            console.log('CALL: searchTeams...')
            ajaxHelper(searchTeamsUri + self.searchTeam(), 'GET').done(function (data) {
                self.teams(data);
            });
        };
        clearTeams = function () {
            self.getTeams();
            self.searchTeam("");
        };
        //---- initial call
        self.getTeams();
    }
    ko.applyBindings(new vm());

});