$(document).ready(function () {
    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var teamUri = 'http://192.168.160.28/football/api/teams/';
        var seasonsUri = 'http://192.168.160.28/football/api/teams/seasons/';
        self.className = 'Team Seasons';
        self.description = 'This page aims to demonstrate the use of the football web API for countries and the interconnection with other entities.<br>Called method(s): <ul><li>' + teamUri + '</li></ul>';
        self.error = ko.observable();
        self.teamInfo = ko.observableArray([]);
        self.seasonsInfo = ko.observableArray([]);
        self.id = ko.observable();
        self.idSoFifa = ko.observable();
        self.team = ko.observable();
        self.kits = ko.observableArray([]);
        var ida;
        var indice;

        var url = location.hash;
        //Get the team id
        self.id(url.split("#")[1]);
        console.log(self.id());

        //Get the SoFifa team id
        self.idSoFifa(url.split("#")[2]);
        console.log("SoFifa: " + self.idSoFifa());

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
        self.getTeamInfo = function () {
            console.log('CALL: getTeamInfo...');
            ajaxHelper(teamUri + self.id(), 'GET').done(function (data) {
                self.team(data);
            });
        };

        self.getSeasonsInfo = function () {
            console.log('CALL: getTeamSeasonsInfo...');

            ajaxHelper(seasonsUri, 'GET').done(function (data) {
                console.log("Let's go...");
                self.seasonsInfo(data);
                self.seasonsInfo.reverse();
                console.log(self.seasonsInfo());
            });
        };

        //-- tshirt texto header
        showseasonKits = function (ida) {
            document.getElementById('seasonKits').innerHTML = '<h1>' + ida + ' Season Kits</h1>'
            console.log(ida);

        }

        pageReload = function () {
            window.location.reload();
        };

        //-- atributos texto header
        showTeamAtributes = function (ida) {
            document.getElementById('teamAtributtes').innerHTML = '<h1>' + ida + ' Team Atributes</h1>'
            console.log(ida);
        }

        getTeamKits = function (ida) {
            self.kits.removeAll();
            console.log(ida);

            $('#teamKits').slideDown(500);
            console.log(ida)
            for (var i = 0; i <= 3; i++) {
                var x = 'https://cdn.sofifa.org/' + ida + '/kits/' + self.idSoFifa() + '/' + i + '_0.png';
                self.kits.push(x);
                console.log(x);
            }

        };

        getInfoTeams = function (ida) {
            console.log('CALL: getInfoTeams...')
            if (ida == '16') {
                indice = 0;
            }
            if (ida == '15') {
                indice = 1;
            }
            if (ida == '14') {
                indice = 2;
            }
            if (ida == '13') {
                indice = 3;
            }
            if (ida == '12') {
                indice = 4;
            }
            if (ida == '11') {
                indice = 5;
            }
            if (ida == '10') {
                indice = 6;
            }
            if (ida == '09') {
                indice = 7;
            }
            console.log(indice)

            ajaxHelper(seasonsUri + self.id(), 'GET').done(function (data) {
                console.log('Buscar...')
                self.teamInfo(data[indice]);
                console.log(self.teamInfo());
            });
        };
        //---- initial call
        self.getTeamInfo();
        self.getSeasonsInfo();
    }
    ko.applyBindings(new vm());

});