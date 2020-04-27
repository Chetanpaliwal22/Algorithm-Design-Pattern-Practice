package com.concordia.algo;

import java.util.*;

class BackSpaceCompare {
 public boolean backspaceCompare(String S, String T) {

  Stack schar = new Stack ();
  Stack tchar = new Stack ();

	for (char c: S.toCharArray()) {
   if (c == '#') {  
    if (!schar.isEmpty()) {
     schar.pop();
    }
   } else {
    schar.push(c);
   }

  }


  for (char c: T.toCharArray()) {
   if (c == '#') {
    if (!tchar.isEmpty()) {
     tchar.pop();
    }
   } else {
    tchar.push(c);
   }

  }


  if (schar.size() != tchar.size()) {
   System.out.println("here");
   return false;
  } else {
   while (!schar.isEmpty()) {
    if (schar.pop() != tchar.pop()) {
     return false;
    }
   }
  }


  return true;
 }
}
