define(function() {
	//
	window.location.href = "#moviedetails/"+Math.floor((Math.random() * 5000) + 1).toString();
	location.reload();
	return 1;
});
