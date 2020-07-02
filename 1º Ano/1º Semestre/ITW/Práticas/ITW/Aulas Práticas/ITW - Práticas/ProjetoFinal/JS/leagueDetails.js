$(document).ready(function () {
    $('#back').click(function () {
        window.location.assign('leagues.html');
        console.log("ALERT: 123!!!");
    });

    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var baseUri = 'http://192.168.160.28/football/api/leagues/';
        self.className = 'League Details';
        self.description = 'This page aims to demonstrate the use of the football web API for leagues and the interconnection with other entities.<br>Called method(s): <ul><li>' + baseUri + '</li></ul>';
        self.error = ko.observable();
        self.league_info = ko.observableArray();
        self.id = ko.observable();

        var url = location.hash;
        self.id(url.split("#").pop());
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
        self.getLeagueInfo = function () {
            console.log('CALL: getLeagueInfo...');
            ajaxHelper(baseUri + self.id(), 'GET').done(function (data) {
                self.league_info(data);
            });
        };
        //---- initial call
        self.getLeagueInfo();
    }
    ko.applyBindings(new vm());

});