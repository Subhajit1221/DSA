class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int f1[]= new int[256];
         int f2[]= new int[256];


         for(int i=0;i<ransomNote.length();i++){
            f1[ransomNote.charAt(i)]++;
         }

         for(int i=0;i<magazine.length();i++){
            f2[magazine.charAt(i)]++;
         }

         for(int i=0;i<256;i++){
            if(f1[i]>f2[i]){
                return false;
            }
         }

         return true;
        
    }
}