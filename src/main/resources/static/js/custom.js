/**
 * 
 */
alert("I'm active");

var detailsOfEnv = [];
function addEnvironment() {
	var env = document.getElementById("environment");
	var result = env.options[env.selectedIndex].text;
	var url = document.getElementById("url").value;
	console.log(result);
	console.log(url);

	var isAccessibleData=document.getElementsByName("isAccessible");
	console.log(isAccessibleData);
	console.log("isAccessibleData:>>> ",isAccessibleData[0].checked);
	var environmentDetails = {
		'environment' : result,
		'url' : url,
		'accessible' :isAccessibleData[0].checked
	};
	console.log(environmentDetails);
	detailsOfEnv.push(environmentDetails);
	displayTable();
}
function displayTable() {
	var environmentData = " "
	environmentData = "<table border='1' class='table table-striped'><tr> <th>Environment</th> <th>URL</th> <th>IsAccessible</th> </tr>";
	for (var i = 0; i < detailsOfEnv.length; i++) {
		environmentData = environmentData+ "<tr> <td><input type='hidden' name='environmentList["+i+"].environment' value='"+detailsOfEnv[i].environment+"' /> "+detailsOfEnv[i].environment+"</td>	<td><input  type='hidden' name='environmentList["+i+"].url' value='"+detailsOfEnv[i].url+"' />"+detailsOfEnv[i].url+"</td> <td><input  type='hidden' name='environmentList["+i+"].isAccessible' value='"+detailsOfEnv[i].accessible+"' /> "+detailsOfEnv[i].accessible+"</td> </tr>";
	}
	environmentData =environmentData+ "</table>";
	console.log(environmentData);
	document.getElementById("showEnvironment").innerHTML = environmentData
	document.getElementById("closeModal").click();
}
