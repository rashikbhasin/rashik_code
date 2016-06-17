def rotateLeft(arr,x):
	swap(arr,0,x-1);
	swap(arr,x,len(arr)-1);
	swap(arr,0,len(arr)-1);

def swap(arr,l,h):
	while(l<h):
		t=arr[l];
		arr[l]=arr[h];
		arr[h]=t;
		l=l+1;
		h=h-1;

if __name__ == "__main__":
	arr=[1,2,3,4,5,6];
	rotateLeft(arr,2);
	for i in arr:
		print(i);