package com.paremal.sheebu.algorithms;

public class TwoDhourGlass {
	
	public static int calculateMaxHourGlass(int[][] sample) {
		
		
		System.out.println(sample[0].length);
		//int[ ] start= {0,1};
		int max=0;
		for(int x=0;x<sample[0].length-2;x++) {
			for(int y=0;y<sample.length-2;y++) {
				int[] leftTop= {x,y};
				int tmax=getHourglass(leftTop, sample);
				if(tmax>max){
					max= tmax;
				}
			}
		}
		System.out.println("max#"+max);
		return 0;
	}
	
	public static void main(String[] args) {
		int[][] arrNos= {{9,9,9,5,9,4},{9,5,9,7,9,3},{7,8,9,2,9,1},{1,2,3,5,9,6},{7,8,9,2,9,5},{7,8,9,2,9,5}};
		calculateMaxHourGlass(arrNos);
	}
	static int getHourglass(int[] leftTop, int[][] arr) {
		int x= leftTop[0];
		int y=leftTop[1];
		int sum=0;
		for(int i=y;i<y+3;i++) {
			for(int j=x;j<x+3;j++) {
				//System.out.println(j+" "+i);
				System.out.printf("%d ",arr[i][j]);
				if (i==y+1 && j==x) continue;
				if (i==y+1 && j==x+2) continue;
				sum+=arr[i][j];
			}
		}
		System.out.println("sum:"+sum);
		return sum;
	}

}
