// class Solution {
//     public String addStrings(String num1, String num2) {
//         int s1=num1.length()-1;
//         int s2=num2.length()-1;
//         int carry=0;
//       StringBuilder sb =new StringBuilder();
//         while(s1 >=0 ||s2>=0 ||carry>0){
//             int csum=0;
//             if(s1>=0){
//            csum +=num1.charAt(s1)-'0';
//            s1--;
//             }
//            if(s2>=0){
//            csum +=num2.charAt(s2)-'0';
//            s2--;
//            }
//            csum =csum +carry;
//          sb.append(csum %10);
//          carry=csum /10;
//         }

//         return sb.reverse().toString();
//     }
  
// }
//method 2
        // num1 ko bada/equal banana
       class Solution {
    public String addStrings(String num1, String num2) {

        int n1 = num1.length();
        int n2 = num2.length();

        // num1 ko bada/equal banana
        if (n1 < n2) {
            String temp = num1;
            num1 = num2;
            num2 = temp;

            int t = n1;
            n1 = n2;
            n2 = t;
        }

        // num2 ke beginning me 0 add karna
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n1 - n2; i++) {
            sb.append('0');
        }

        sb.append(num2);
        String nnum2 = sb.toString();

        int carry = 0;

        StringBuilder res = new StringBuilder();

        for (int i = n1 - 1; i >= 0; i--) {

            int csum = (num1.charAt(i) - '0')
                     + (nnum2.charAt(i) - '0')
                     + carry;

            res.append(csum % 10);

            carry = csum / 10;
        }

        if (carry > 0) {
            res.append(carry);
        }

        return res.reverse().toString();
    }
}