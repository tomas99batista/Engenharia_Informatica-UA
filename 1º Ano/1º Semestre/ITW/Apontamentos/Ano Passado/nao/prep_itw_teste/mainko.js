var myViewModel = function() {
    var self  = this;
    self.tickets = ko.observableArray([{ name:"Economy", price: 199.95},
                                       { name:"Business", price: 449.22},
                                       { name:"First Class", price: 1199.99}]);
    
}
    self.chosenTicket = ko.observable();
    self.resetTicket  = function() {self.chosenTicket(null)}

ko.applyBindings(myViewModel);