var generatePattern = function(){
	var number = document.getElementById("inp").value;
	var arr = initializeChessBoard(number);
	if(placeQueen(0,arr) == undefined)
		console.log("No Possible Solutions available");
	else
		console.log(arr);		
}

var placeQueen = function(row,arr){
	var size = arr.length;
	for(var i=0;i<size;i++){
		if(isPlacable(row,i,arr)){
			arr[row][i] = 'x';
			if(row+1 <size){
				if(!(placeQueen(row+1,arr)))
					arr[row][i] = 0;
				else
					return true;
			}
			else{
				return true;
			}
		}
		else if(i==size-1)
			return false;
	}
}

var initializeChessBoard = function(number){
	var arr = [];
	for(var i = 0; i<number;i++){
		var ar = [];
		for(var j = 0;j<number;j++){
			ar[j] = 0;
		}
		arr[i] = ar;
	}
	return arr;
}

var isPlacable = function(row, col, arr){

	//checking the column 
	for(var i = row-1 ; i>=0 ; i--){
		if(arr[i][col] == 'x')
			return false;
	}
	//checking the row
	for(var i = col-1 ; i>=0 ; i--){
		if(arr[row][i] == 'x')
			return false;
	}
	//lower diagonal
	for(var i=row+1, j=col+1; (i<arr.length && j<arr.length);i++,j++){
		if(arr[i][j] == 'x')
			return false;
	}
	//upper diagonal
	for(var i=row-1, j=col-1; (i>= 0 && j>= 0);i--,j--){
		if(arr[i][j] == 'x')
			return false;
	}
	//right upper diagonal
	for(var i=row-1,j=col+1; (i>=0&&i<arr.length)&&(j>=0&&j<arr.length);i--,j++){
		if(arr[i][j] == 'x')
			return false;
	}
	//right lower diagonal
	for(var i=row+1,j=col-1; (i>=0&&i<arr.length)&&(j>=0&&j<arr.length);i++,j--){
		if(arr[i][j] == 'x')
			return false;
	}
	return true;
}

