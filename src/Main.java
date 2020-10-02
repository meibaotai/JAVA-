import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.*;


public class Main {


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean[] result=new boolean[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            Integer m=s.nextInt();
            s.nextLine();
            boolean re=false;
            while (m!=1){
                String a=Integer.toBinaryString(m);
//                System.out.println(a);
                int count=0;
                int p=-1;
                int j=0;
                for(Character c:a.toCharArray()){
                    if(c.equals('1')) {
                        count++;
                        if(p==-1){
                            p=j;
                        }
                    }
                    j++;
                }
                if(count==1){
                    m/=2;
                    re=!re;
                }else {
                    Double x=Math.pow(2,a.length()-p-2);
                    m-=x.intValue();
                    re=!re;
                }
                System.out.println(re);
            }
            result[i]=re;
        }
        for(int i=0;i<n;i++){
            if(result[i]){
                System.out.println("Louise");
            }else {
                System.out.println("Richard");
            }
        }
    }


//
//    Scanner scanner=new Scanner(System.in);
//    int n=scanner.nextInt();
//        scanner.nextLine();
//    int m=n;
//    String s="";
//    int x=0;
//        if(m>243) {
//        x = 5;
//        Double c = Math.pow(3, x);
//
//        int z = m/c.intValue();
//        switch (z) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//        m-=z*c.intValue();
//        if(m==0||m==1) m=82;
//    }
//
//        if(m>81){
//        x=4;
//        Double c = Math.pow(3, x);
//
//        int z = m/c.intValue();
//        switch (z) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//        m-=z*c.intValue();
//        if(m==0||m==1) m=28;
//    }
//        if(m>27){
//        x=3;
//        Double c = Math.pow(3, x);
//
//        int z = m/c.intValue();
//        switch (z) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//        m-=z*c.intValue();
//        if (m==1||m==0) m=10;
//    }
//        if(m>9){
//        x=2;
//        Double c = Math.pow(3, x);
//
//        int z = m/c.intValue();
//        switch (z) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//        m-=z*c.intValue();
//        if (m==1||m==0) m=4;
//    }
//        if(m>3){
//        x=1;
//        Double c = Math.pow(3, x);
//
//        int z = m/c.intValue();
////            System.out.println(c);
////            System.out.println(z);
//        switch (z) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//        m-=z*c.intValue();
//        if(m==0) m=1;
//    }
//        if(m<=3&&m>0){
//        switch (m) {
//            case 1:
//                s += "2";
//                break;
//            case 2:
//                s += "3";
//                break;
//            case 3:
//                s += "5";
//                break;
//        }
//    }
//
//        System.out.println(s);
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        s.nextLine();
//        String[] dSize=s.nextLine().split(" ");
//        String[] dValue=s.nextLine().split(" ");
//        Integer[][] t=new Integer[dSize.length+1][n];
//        for(int i=0;i<dSize.length+1;i++){
//
//            for(int j=0;j<n;j++){
//                if(i==0){
//                    t[i][j]=0;
//                }else {
//                    if(j==0){
//                        t[i][j]=0;
//                    }else {
//                        if(j<Integer.valueOf(dSize[i])){
//                            t[i][j]=t[i-1][j];
//                        }else {
//                            t[i][j]=Math.max(t[i-1][j],t[i-1][j-Integer.valueOf(dSize[i]+Integer.valueOf(dValue[i]))]);
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(t[dSize.length][n]);
//
//
//
//
//    }
//
//    public static void  method(int[][] wei,String[] str){
//
//    }

//    public static int figure(int n){
//        int ans=0;
//        for(int i=0;i<n/2;i++){
//            char[] a=String.valueOf(i).toCharArray();
//            char[] b=String.valueOf(n-i).toCharArray();
//            int result=0;
//            for(int j=0;j<a.length;j++){
//                result+=a[j]-48;
//            }
//            for(int z=0;z<b.length;z++){
//                result+=b[z]-48;
//            }
//            if(result>ans){
//                ans=result;
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        s.nextLine();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            int x=s.nextInt();
//            s.nextLine();
//            arr[i]=figure(x);
//        }
//        for(int i:arr){
//            System.out.println(i);
//        }
//
//    }


//    public static boolean ab(String a,String b){
//        // 比较a是不是小雨b
//        char[] ac=a.toCharArray();
//        char[] bc=b.toCharArray();
//        for(int i=0;i<ac.length;i++){
//            if(i<bc.length) {
//                if (ac[i] > bc[i]) return false;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        String ss=s.nextLine();
//        int k=s.nextInt();
//        s.nextLine();
//        LinkedHashMap<String ,Integer> hashMap=new LinkedHashMap<>();
//        String bb=String.valueOf(ss.charAt(0));
//        for(int i=0;i<ss.length();i++){
//            for(int j=i;j<ss.length();j++){
//                String si=null;
//                if(i==j){
//                    si=String.valueOf(ss.charAt(i));
//                }else {
//                    si=ss.substring(i,j);
//                }
//                if(hashMap.containsKey(si)){
//                    continue;
//                }else {
//                    if(hashMap.size()<k){
//                        hashMap.put(si,i);
//                    }else {
//                        if(ab(si,bb)) {
//                            String[] s1 = new String[hashMap.size()];
//                            s1 = hashMap.keySet().toArray(s1);
//                            String big = s1[0];
//                            for (String s2 : s1) {
//                                if (ab(big, s2)) {
//                                    big = s2;
//                                }
//                            }
//                            hashMap.remove(big);
//                            hashMap.put(si, i);
//                            s1 = hashMap.keySet().toArray(s1);
//                            bb = s1[0];
//                            for (String s2 : s1) {
//                                if (ab(bb, s2)) {
//                                    bb = s2;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        String[] s1=new String[hashMap.size()];
//        s1=hashMap.keySet().toArray(s1);
//        String big=s1[0];
//        for(String s2:s1){
//            if(ab(big,s2)){
//                big=s2;
//            }
//        }
//        System.out.println(big);
//    }
//
//
//
//    public static class node{
//        int i;
//        node next;
//        public node(){}
//        public node(int i) {this.i=i;}
//        public node(node n){this.next=n;}
//        public node(int i,node n){this.i=i;this.next=n;}
//    }
//    public static node delete(node a,int k){
//        node p=a.next;
//        for(int i=0;i<k-2;i++){
//            p=p.next;
//        }
//        node t=new node(p.next.i);
//        node e=p.next.next;
//        p.next=t;
//        t.next=e;
//        return a;
//    }
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int k=s.nextInt();
//        s.nextLine();
//        List<Integer> arr=new ArrayList<>();
//        // 构建链表
//        for(int i=0;i<n;i++){
//            arr.add(s.nextInt());
//        }
//        arr.remove(k-1);
//        for (int u:arr){
//            System.out.print(u+" ");
//        }
//        System.out.println("");
//    }

//    public static  int Add(int[] arr,int xs,int xe,int ys,int ye,int n,int m){
//        int result=0;
//        for(int i=xs;i<=xe;i++){
//            for(int j=ys;j<=ye;j++){
//                result+=arr[i*m+j];
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        int[][] arr=new int[n][m];
//        scanner.nextLine();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j=scanner.nextInt();
//            }
//            scanner.nextLine();
//        }
//        int result=0;
//        for(int i=0;i<n;i++){
//            int[] r=new int[m];
//            int[] d=new int[m];
//            for(int j=0;j<n;j++){
//                for(int z=0;z<m;z++){
//                    r[z]+=arr[j][z];
//                }
//                result=Math.max(result,r[0]);
//                d[0]=r[0];
//                for(int u=1;u<m;u++){
//                    if(d[u-1]<0) d[u]=r[u];
//                    else d[u]=d[u-1];
//                    result=Math.max(result,d[u]);
//                }
//            }
//        }
//    }
//
//
//
//
//    public static void main1(String[]  args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        List<Integer[]> list=new ArrayList<>();
//        for (int i=0;i<n;i++){
//            Integer[] arr=new Integer[3];
//            arr[0]=scanner.nextInt();
//            arr[1]=scanner.nextInt();
//            arr[2]=scanner.nextInt();
//        }
//
//    }

//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        scanner.nextLine();
//        Float[] arr1=new Float[n];
//        for(int i=0;i<n;i++){
//            arr1[i]=scanner.nextFloat();
//        }
//        Arrays.sort(arr1);
//        scanner.nextLine();
//        Float max_w=0f;
//        LinkedHashMap<Float,List<Float>> hashMap=new LinkedHashMap<>();
//        for(int i=0;i<m;i++){
//            Float b=scanner.nextFloat();
//            Float w=scanner.nextFloat();
//            if(w>max_w) max_w=w;
//            scanner.nextLine();
//            if(hashMap.containsKey(w)){
//                List<Float> list=hashMap.get(w);
//                list.add(b);
//                hashMap.remove(w);
//                hashMap.put(w,list);
//            }else {
//                List<Float> list=new ArrayList<>();
//                list.add(b);
//                hashMap.put(w,list);
//            }
//        }
//        Float all_w=0f;
//        int number=arr1.length;
//        int used=1;
//        Float[] key=new Float[hashMap.keySet().size()];
//        key=hashMap.keySet().toArray(key);
//        Arrays.sort(key);
//        s:for(int i=key.length-1;i>=0;i--){
//            if(hashMap.containsKey(key[i])){
//                List<Float> list=hashMap.get(key[i]);
//                Float[] a=new Float[list.size()];
//                a=list.toArray(a);
//                Arrays.sort(a);
//                for (int j=a.length-1;j>=0;j--){
//                    if(arr1[arr1.length-used]>=a[j]){
//                        arr1[arr1.length-used]=0f;
//                        all_w+=key[i];
//                        used++;
//                        if(number==0){
//                            break s;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(all_w.intValue());
//
//    }


//    public static Integer getMinResult(int[] arr,int m){
//        // 排序
//        Arrays.sort(arr);
//        Integer n=arr.length-2*m;
//        // 从中取前2m小的数。每次将最大的最最小的数字相乘，然后乘积相加即为最小结果
//        Integer result=0;
//        for (int i=0;i<m;i++){
//            result+=arr[i]*arr[arr.length-n-1-i];
//        }
//        return result;
//    }
//
//    public static Integer getResult(LinkedList<Integer> a,LinkedList<Integer> b){
//        // 认为该题默认的是a-b；
//        // 从个位数开始反向存数字，减法处理如果不够大采用借位（如果没有下一个，记为负数
//        // 输出的时候循环结果链表，数字乘以i*10，与上次循环结果相加。
//        LinkedList<Integer> result=new LinkedList<>();
//        Integer n=(a.size()>b.size())?a.size():b.size();
//        Iterator<Integer> iterator=a.listIterator();
//        Iterator<Integer> iteratorb=a.listIterator();
//        boolean borrow=false;
//        for(int i=0;i<n;i++){
//            Integer x=iterator.hasNext()?iterator.next():0;
//            Integer y=iteratorb.hasNext()?iteratorb.next():0;
//            if(borrow){
//                x-=1;
//            }
//            if(x>y){
//                result.add(x-y);
//                borrow=false;
//            }else {
//                if(iterator.hasNext()){
//                    borrow=true;
//                    result.add(x+10-y);
//                }
//            }
//        }
//        if(borrow){
//            System.out.print("-");
//        }
//        System.out.print(result.get(0));
//        for (int j=1;j<result.size();j++){
//            System.out.print(result.get(j)*j*10);
//        }
//    }

//    public static TreeMap<Integer,Integer> treeMap=new TreeMap<>();
//    public ConcurrentHashMap
//    public static void getTree(){
//
//    }
//
//    private static void quickSort(int[] arr,int l,int r){
//        int p,i,j,temp;
//        if(l>=r){
//            return;
//        }
//        p=arr[l];
//        i=l;
//        j=r;
//        while (i<j){
//            while (arr[j]>=p&&i<j){
//                j--;
//            }
//            while (arr[i]<=p&&i<j){
//                i++;
//            }
//            temp=arr[j];
//            arr[j]=arr[i];
//            arr[i]=temp;
//            System.out.println(Arrays.toString(arr));
//        }
//        arr[l]=arr[i];
//        arr[i]=p;
//        quickSort(arr,l,j-1);
//        quickSort(arr,j+1,r);
//    }
//
//
//    public static void main(String[] args){
//        int[] arr=new int[]{3,10,4,3,658,9,4,5,6,76,8,99,45,10};
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }

//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        Integer n=scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(Integer.toBinaryString(n));
//        int count=0;
//        while(n>0){
//            count++;
//            n=n&(n-1);
//        }
//        System.out.println(count);
//    }
//
//    public static void main(String[] args){
//        String s="a";
//        for(int i=0;i<2000;i++){
//            s+="a";
//        }
//        System.out.println(s);
//        s=s.replace(" ","");
//    }

//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        Integer n=scanner.nextInt();
//        Long.valueOf()
//        scanner.nextLine();
//        int count=0;
//        String result=Integer.toBinaryString(n);
//        for(int i=0;i<result.length();i++){
//            Character character=result.charAt(i);
//            if(character.toString().equals("1")){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static void main(String[] args) throws Exception{
//
//        Scanner scanner=new Scanner(System.in);
//        String s=scanner.nextLine();
//        int n=scanner.nextInt();
//        String sa="";
//        String sb="";
//        for(int i=0;i<s.length();i++){
//            if(i<n){
//                sa+=s.charAt(i);
//            }else {
//                sb+=s.charAt(i);
//            }
//        }
//        System.out.println(sb+sa);
//    }

//    public static  void  main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        int[] arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=scanner.nextInt();
//        }
//        scanner.nextLine();
//        Arrays.sort(arr);
//        for(int a:arr){
//            System.out.print(a+" ");
//        }
//        System.out.println("");
//    }

//    public static void main(String[] args){
//        // process input
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        scanner.nextLine();
//        int[] arr=new int[n*m];
//        HashMap<Integer,Integer[]> hashMap=new HashMap<>();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i*n+j]=scanner.nextInt();
//                hashMap.put(arr[i*n+j],new Integer[]{i,j});
//            }
//            scanner.nextLine();
//        }
//        Arrays.sort(arr);
//        int result=0;
//        for(int z=1;z<=m;z++){
//            boolean search=true;
//            int p=2;
//            Integer[] one=hashMap.get(arr[arr.length-z]);
//            while (search){
//                Integer[] temp=hashMap.get(arr[arr.length-p]);
//                if(one[0]!=temp[0]&&one[1]!=temp[1]){
//                    search=false;
//                    if(result<arr[arr.length-z]*arr[arr.length-p]){
//                        result=arr[arr.length-z]*arr[arr.length-p];
//                    }
//                }
//                p++;
//            }
//        }
//        System.out.println(result);
//
//
//
//    }

//    public static boolean isReInt(int n){
//        int x=4*n;
//        Integer xs=Integer.valueOf(x);
//        Integer ns=Integer.valueOf(n);
//        int len=xs.length()-ns.length();
//        for(int j=0;j<len;j++){
//            ns="0"+ns;
//        }
//        IntegerBuilder sb=new IntegerBuilder(ns);
//        if(xs.equals(sb.reverse().toInteger())){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    public static void main(Integer args[]){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        int x=n/4;
//        int count=0;
//        List<Integer> result=new ArrayList<>();
//        for(int i=1;i<x;i++){
//            if(isReInt(i)){
//                count++;
//                result.add(i+" "+4*i);
//            }
//        }
//        System.out.println(count);
//        for(Integer s:result){
//            System.out.println(s);
//        }
//    }

//    public static void main(Integer[] args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        scanner.nextLine();
//        HashMap<Integer,List<Integer>> hashMap=new HashMap<>();
//        for(int i=0;i<n;i++){
//            Integer[] s=scanner.nextLine().split(" ");
//            if(hashMap.containsKey(s[0])){
//                List<Integer > list=hashMap.get(s[0]);
//                list.add(s[1]);
//                hashMap.remove(s[0]);
//                hashMap.put(s[0],list);
//            }else {
//                List<Integer> list=new ArrayList<>();
//                list.add(s[1]);
//                hashMap.put(s[0],list);
//            }
//        }
//        int count=0;
//        HashMap<Integer,Integer > searchP=new HashMap<>();
//        Set<Integer > s=hashMap.keySet();
//        for(Integer ts:s){
//            if(hashMap.containsKey(ts)) {
//                List<Integer> list = hashMap.get(ts);
//                Integer target=list.get(0);
//                searchP.put(ts,target);
//                boolean search=true;
//                while (search){
//                    if(!hashMap.containsKey(target)){
//                        searchP.clear();
//                    }else {
//                        for()
//                    }
//                }
//            }else {
//                continue;
//            }
//
//        }
//
//
//
//    }

//    public static void main(Integer[] args){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        scanner.nextLine();
//        HashMap<Integer,HashMap<Integer ,Integer> > hashMap=new HashMap<>();
//        sss:for (int i=0;i<m;i++){
//            String[] s5=scanner.nextLine().split(" ");
//            Integer[] s=new Integer[2];
//            s[0]=Integer.valueOf(s5[0]);
//            s[1]=Integer.valueOf(s5[1]);
//            for (Integer s1:hashMap.keySet()){
//                HashMap<Integer ,Integer> hashMap1=hashMap.get(s1);
//                if(hashMap1.containsKey(s[0])){
//                    hashMap1.put(s[1],0);
//                    continue sss;
//                }else {
//                    if(hashMap1.containsKey(s[1])) {
//                        hashMap1.put(s[0], 0);
//                        continue sss;
//                    }
//                }
//            }
//            HashMap<Integer ,Integer> hashMap2=new HashMap<>();
//            hashMap2.put(s[1],0);
//            hashMap2.put(s[0],0);
//            hashMap.put(i,hashMap2);
//
//        }
//        Set<Integer> set=hashMap.keySet();
//        Integer[] ss5=new Integer[set.size()];
//        ss5=set.toArray(ss5);
//        Arrays.sort(ss5);
//        for(Integer s:ss5){
//            String  ss=s+" ";
//            HashMap<Integer ,Integer> hashMap1=hashMap.get(s);
//            for (Integer s1:hashMap1.keySet()){
//                ss=ss+s1+" ";
//            }
//            System.out.println(ss);
//        }
//    }
}
