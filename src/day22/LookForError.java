package day22;

import java.util.Scanner;

public class LookForError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String log = ".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}.h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;width:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3px 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !important}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underline}";
//look for every error and print count
		//
		
		int count = 0;
		for (int i = 0;i<=log.length()-5;i++) {
			String temp = log.substring(i,i+5);
			System.out.println(temp);
			if (temp.equals("error")){
				count+=1;
				
			
		
				
			}
			System.out.println(count);
			if(count>0) {
				System.out.println("fail");
			} else {
			System.out.println("pass");
			}
		}
		
		
		
	
		
		
		
		
		
		

	}
	
	
	

}
