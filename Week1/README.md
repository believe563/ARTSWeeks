leetcode problem 7  

将有符号整数反转，符号不变，反转后如果超出整数的数值范围，则返回0，否则返回反转后的整数。  

分析：  

leetcode网站上的解法思路：  

1-把数值反转看成字符串反转  

  创建一个整数rev记录反转后的整数，每次将rev最后一个数*10，再加上当前遍历的原整数中的数字   

  但是这个操作的缺点是该被创建的整数可能会溢出，用如下两个条件进行控制：  

  	1.如果rev不大于Integer.MAX_VALUE/10或不小于Integer.MIN_VALUE  

	2.如果rev==Integer.MAX_VALUE或rev==Integer.MIN_VALUE,且对应弹出的最后一位pop大于7或小于-8   

  缺点是每次循环都要判断，对10位数的数字来说，溢出判断直到rev即将添加最后一位时才能判断出来  


  	
我的解法的缺点：  

    空间复杂度高，但在时间上略胜于leetcode上解法的地方是在循环外进行判断  

改进：leetcode上的解法中，将判断条件移出循环外，写成如下所示：  

      public int reverse(int x) {  

        int rev = 0;  

		int pop;  

        while (x/10 != 0) {  

        	pop = x % 10;  

            x /= 10;  

            rev = rev * 10 + pop;  

        }  

        pop = x % 10;  

        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;  

        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;  

        rev = rev * 10 + pop;  

        return rev;  

    }  

    
