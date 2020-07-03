$(document).ready(function () {
    $(function () {
        $('[data-toggle="popover"]').popover();
    });

    var vm = function () {
        console.log('ViewModel initiated...')
        //---Variáveis locais
        var self = this;
        var matchesUri = 'http://192.168.160.28/football/api/matches/';
        self.matchId = ko.observable();
        self.error = ko.observable();
        self.matches = ko.observableArray([]);
        var url = location.hash;
        //Get the match id
        self.matchId(url.split("#")[1]);
        console.log(self.matchId());

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
        self.getMatch = function () {
            console.log('CALL: getMatch...');
            ajaxHelper(matchesUri + self.matchId(), 'GET').done(function (data) {
                self.matches(data);
                console.log(self.matches());
            });
        };
        
        //---- initial call
        self.getMatch();
    }
    ko.applyBindings(new vm());

});