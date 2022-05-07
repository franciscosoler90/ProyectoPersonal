package unidad7_colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EjerTresSetInt {

	public static void main(String[] args) {
		int vecesRandom=(int) (15);
		int[] nums=new int[vecesRandom];
		HashSet<Integer> hashSet=new HashSet<>();
		TreeSet<Integer> treeSet=new TreeSet<>();
		LinkedHashSet<Integer> linkedSet=new LinkedHashSet<>();
		
		System.out.println("Se van a generar "+vecesRandom+" datos.");
		for(int i=0;i<nums.length;i++) {
			 nums[i]=(int) (Math.random()*200+1);
			 //nums[i]+=(int) (Math.random()*1000+1);
			 hashSet.add(nums[i]);
			 treeSet.add(nums[i]);
			 linkedSet.add(nums[i]);
			 System.out.print(nums[i]+" * ");
		 }
		System.out.println();
		System.out.println();
		System.out.println("Valores de objHashSet:");
		for(Integer numero: hashSet) {
			System.out.print(numero+" | ");
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores de objTreeSet:");
		for(Integer numero: treeSet) {
			System.out.print(numero+" | ");
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Valores de objLinkedHashSet:");
		for(Integer numero: linkedSet) {
			System.out.print(numero+" | ");
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("Valores de objHashSet (sin duplicados, sin orden): "+hashSet.toString());
		System.out.println();
		System.out.println("Valores de objTreeSet (sin duplicados, ordenados): "+treeSet.toString());
		System.out.println();
		System.out.println("Valores de obHashLinkedSet (sin duplicados, orden de insercion): "+linkedSet.toString());
	}
}