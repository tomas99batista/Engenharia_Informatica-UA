$(document).ready(function () {
    //Date Picker
    $(function () {
        $("#birthDate").datepicker();
    });
    $(function () {
        $("#editBirthDate").datepicker();
    });
    function myViewModel() {
        var self = this;
        self.participants = ko.observableArray();
        self.element = ko.observable();
        //métodos do view model
        self.readParticipants = function () {
            //carrega a lista com um conjunto de participantes
            self.participants = ([
                { 'name': 'Noé Elisabete Ferreiro', 'email': '', 'address': '', 'birthDate': '', 'sex': 'Male', 'course': { 'id': '', 'name': '' } },
                { 'name': 'Marta Matias Lucas', 'email': 'marta.lucas@teste.com', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } },
                { 'name': 'Ezequiel Augusto Melo', 'email': '', 'address': 'Rua de Cima, n.º 8\nAveiro\nPORTUGAL', 'birthDate': '1998/11/17', 'sex': 'Male', 'course': { 'id': '', 'name': '' } },
                { 'name': 'Albino Nico Armando', 'email': '', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } },
                { 'name': 'Alexandra Eufêmia Torres', 'email': '', 'address': '', 'birthDate': '', 'sex': '', 'course': { 'id': '', 'name': '' } }
            ]);
        };

        self.editParticipant = function (participant) {
            var index = self.participants.indexOf(participant);
            element = self.participants()[index];
            $("#editName").val(element.name);
            $("#editEmail").val(element.email);
            $("#editBirthDate").val(element.birthDate);
            //$("#editSex").val(element.sex);
            //$("#editCourse").val(element.course);
            // nao sei como fazer estes 2;        
        };

        self.removeAll = function () {
            self.participants.removeAll();
        };

        self.removeOne = function (participant) {
            self.participants.remove(participant);
        };

        self.addOne = function () {
            self.participants.push({ 'name': $("#name").val(), 'email': $("#email").val(), 'address': $("#address").val(), 'birthDate': $("#birthDate").val(), 'sex': $("#sex option:selected").val(), 'course': { 'id': '', 'name': $("#course").val() } });
            $("#name").val('');
            $("#email").val('');
            $("#address").val('');
            $("#birthDate").val('');
            $("#course").val('');
            $("#sex").val('');
        };

        self.updateOne = function (participant) {
            self.participants.replace(participant, { 'name': $("#editName").val(), 'email': $("#editEmail").val(), 'address': $("#editAddress").val(), 'birthDate': $("#editBirthDate").val(), 'sex': $("#editSex option:selected").val(), 'course': { 'id': '', 'name': $("#editCourse").val() } });
        };

    }
    ko.applyBindings(new myViewModel());

});