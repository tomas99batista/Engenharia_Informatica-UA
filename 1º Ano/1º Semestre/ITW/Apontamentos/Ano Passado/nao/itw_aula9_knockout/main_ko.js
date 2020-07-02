function MyViewModel() {
    var self = this;
    self.tmp = ko.observable();
    self.participants = ko.observableArray();
    
    
    self.AddUser = function() {
        self.participants.push({'name': $("#Name").val(), 'email': $("#Email").val(), 'address': $("#Address").val(), 'birthDate':$("#datepicker").val(), 'sex': $( "form input:radio" ).val(), 'course': {'id' : '', 'name' : $("#course").val()}}); 
        console.log($( "form input:radio" ).text());
        $("#Name").val('');
        $("#Email").val('');
        $("#Address").val('');
        $("#datepicker").val('');
        $("#course").val('');
        $( "form input:radio" ).val('');
    };
    
    self.readparticipants = function() {
        self.participants.push(
            {'name': 'Noé Elisabete Ferreiro', 'email' : '', 'address' : '', 'birthDate' : '', 'sex' :  'Male', 'course' : {'id' : '', 'name' : ''}},
            {'name': 'Marta Matias Lucas', 'email' : 'marta.lucas@teste.com', 'address' : '', 'birthDate' : '', 'sex' : '', 'course' : {'id' : '', 'name' : ''}},
            { 'name': 'Ezequiel Augusto Melo', 'email': '', 'address': 'Rua de Cima, n.o 8\nAveiro\nPORTUGAL', 'birthDate': '1998/11/17', 'sex': 'Male', 'course': { 'id': '', 'name': '' }},
            {'name': 'Albino Nico Armando', 'email' : '', 'address' : '', 'birthDate' : '', 'sex' : '', 'course' : {'id' : '', 'name' : ''}},
            {'name': 'Alexandra Eufêmia Torres', 'email' : '', 'address' : '', 'birthDate' : '', 'sex' : '', 'course' : {'id' : '', 'name' : ''}}
        );
    };
 
    self.readOne = function(participant) { 
        var index = self.participants.indexOf(participant);
        tmp = self.participants()[index]
        console.log(self.participants()[index].sex)
        $("#Name_edit").val(self.participants()[index].name);
        $("#Email_edit").val(self.participants()[index].email);
        $("#Address_edit").val(self.participants()[index].address);
        $("#datepicker_edit").val(self.participants()[index].birthDate);
        $("#course_edit").val(self.participants()[index].course.name)
        $("#sex_edit").val(self.participants()[index].sex);
        self.participants.remove(participant);
    };
    
    self.SaveChanges = function() {
        self.participants.unshift({'name': $("#Name_edit").val(), 'email': $("#Email_edit").val(), 'address': $("#Address_edit").val(), 'birthDate':$("#datepicker_edit").val(), 'sex':  $("#sex_edit option:selected").val(), 'course': {'id' : '', 'name' : $("#course_edit").val()}});
    };
    
    self.Cancel = function() {
        self.participants.unshift(tmp);
    }
    
    Allremove = function () {
        self.participants.removeAll();
    };

    self.removeOne = function(participant) {
        self.participants.remove(participant);
    };
    
};


$( function() {
$( "#datepicker" ).datepicker();
  });
$( function() {
$( "#datepicker_edit" ).datepicker();
  } );

ko.applyBindings(new MyViewModel());