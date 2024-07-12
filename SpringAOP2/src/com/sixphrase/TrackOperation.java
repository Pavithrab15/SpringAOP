package com.sixphrase;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class TrackOperation {
	
   @Pointcut("execution(* Operation.*(..))")
public void ptc() {}
   
   @Before ("ptc()")
public void myadvice(JoinPoint jp) 
{
	System.out.println("addtional concern");
	System.out.println("Method signature: "+jp.getSignature()); 
}
   	 
}
