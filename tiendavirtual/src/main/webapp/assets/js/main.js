
$(function(){
	
	// for adding a loader
	$(window).load(function(){
		setTimeout(function() {
			$(".se-pre-con").fadeOut("slow");
		}, 500);			
	});	
	
	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');
	
	if((token!=undefined && header !=undefined) && (token.length > 0 && header.length > 0)) {		
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {			
			xhr.setRequestHeader(header,token);			
		});				
	}
	
	switch(window.menu){
		case 'About Us':
			$("#about").addClass('active');
			break;
		case 'Contact Us':
			$("#contact").addClass('active');
			break;
		case 'All Products':
			$("#listProducts").addClass('active');
			break;
		case 'Home':
			$("#home").addClass('active');
			break;
		default:
			$("#listProducts").addClass('active');
			$('#cat_' + menu).addClass('active');
			break;
	}
	
});