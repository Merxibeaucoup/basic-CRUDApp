/**
 * 
 */


$('document').ready(function () {

	$('.table #editButton').on('click', function (event) {

		event.preventDefault();

		var href = $(this).attr('href');

		$.get(href, function (student,status) {

			$('idEdit').val(student.id);
			$('nameEdit').val(student.name);
			$('departmentEdit').val(student.department);
			$('updatedByEdit').val(student.updateBy);
			$('updatedOnEdit').val(student.updateOn.substr(0, 10));



		});

		$('#editModal').modal('show');

	});


	/*
	The delete jQuery code works 
	*/

	$('.table #deleteButton').on('click', function () {
		
		var href = $(this).attr('href');
		event.preventDefault();
		$('#deleteModal #delRef').attr('href', href);

		$('#deleteModal').modal('show');



	});

	


});
