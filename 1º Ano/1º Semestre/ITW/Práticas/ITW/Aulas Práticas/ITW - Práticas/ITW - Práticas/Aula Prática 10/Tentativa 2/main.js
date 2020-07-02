$(document).ready(function () {
    //Date Picker
    $("#birthDate").datepicker(
        { dateFormat: 'dd/mm/yy' }
    );

    function myViewModel() {
        var self = this;
        self.participants = ko.observableArray();
        self.name = ko.observable('');
        self.email = ko.observable('');
        self.address = ko.observable('');
        self.birthDate = ko.observable('');
        self.sex = ko.observable('');
        self.course = ko.observable('');

        self.name2 = ko.observable('');
        self.email2 = ko.observable('');
        self.address2 = ko.observable('');
        self.birthDate2 = ko.observable('');
        self.sex2 = ko.observable('');
        self.course2 = ko.observable('');
        //var controlo = 0;
        var list = [
            { 'name': 'Noé Elisabete Ferreiro', 'email': '', 'address': '', 'birthDate': '', 'sex': 'Male', 'course': { 'id': '', 'name': '' } },
            { 'name': 'Marta Matias Lucas', 'email': 'marta.lucas@teste.com', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } },
            { 'name': 'Ezequiel Augusto Melo', 'email': '', 'address': 'Rua de Cima, n.º 8\nAveiro\nPORTUGAL', 'birthDate': '1998/11/17', 'sex': 'Male', 'course': { 'id': '', 'name': '' } },
            { 'name': 'Albino Nico Armando', 'email': '', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } },
            { 'name': 'Alexandra Eufêmia Torres', 'email': '', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } }
        ];

        self.readParticipants = function () {
            self.participants(list);
            //controlo = 1;
            console.log(self.participants());
        };
        self.deleteAll = function () {
            self.participants.removeAll();
        };

        self.deleteOne = function (participant) {
            self.participants.remove(participant);
        };

        self.addOne = function () {
            self.participants.push({ 'name': self.name(), 'email': self.email(), 'address': self.address(), 'birthDate': self.birthDate, 'sex': self.sex(), 'course': self.course() });
        });
            console.log(self.participants());
        };

        //self.editOne = function () {
        //    self.participants.replace({ 'name': self.name(), 'email': self.email(), 'address': self.address(), 'birthDate': self.birthDate, 'sex': self.sex(), 'course': self.course() });
        //};

        self.readOneParticipant = function (participant) {
            console.log(self.participants.indexOf(participant));
            console.log(participant.name);
            self.name2(participant.name);
            self.email2(participant.email);
            self.address2(participant.address);
            self.birthDate2(participant.birthDate);
            console.log(self.birthDate);
            self.sex2(participant.sex);
            self.course2(participant.course);
        };
    }

    //This activates the view model 
    ko.applyBindings(new myViewModel());
});