var tower = [];
var t1=[4,3,2,1];
var result = t1.join(",");
var tower_height = t1.length;
var t2 = [];
var t3 = [];
tower.push(t1);
tower.push(t2);
tower.push(t3);	
window.onload = display;
var transfer = function(){
	var from = document.getElementById("from").value-1;
	var to = document.getElementById("to").value-1;
	var errors = document.getElementById("errors");
	var popping_element = tower[from][tower[from].length-1];
	var pushing_element = tower[to][tower[to].length-1];
	if((popping_element!=undefined)&&((pushing_element == undefined)||(pushing_element > popping_element))){
		tower[to].push(tower[from].pop());
		if(result === tower[2].join(',')){
			errors.style.display = "block";
			errors.innerHTML = "You Won !!!";
		}
		else
			errors.style.display = "none";
	}
	else{
		errors.style.display = "block";
		errors.innerHTML = "Cannot make that move";
	}
	display();
	console.log(result);
	document.getElementById("from").value="";
	document.getElementById("to").value = "";
	document.getElementById("from").focus();
	
}

var display = function(){
	var output = "<tr><td> Tower - 1</td><td> Tower - 2</td><td> Tower - 3</td></tr>";
	for(var i=tower_height-1;i>=0;i--){
		output+="<tr>";
		for(var j=0;j<tower.length;j++){
			if(tower[j][i] != undefined)
				output+=("<td>"+colorBlock(tower[j][i])+"</td>");
			else
				output+=("<td></td>");
		}
		output+="</tr>"
	}
	document.getElementById("displayDiv").innerHTML = output;
}

var colorBlock = function(number){
	var bl = " ";
	for(var i =1;i<=number;i++)
		bl+= "<div class=c-"+number+"></div>"; 
	return bl;
}