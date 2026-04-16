package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		int[] prices = new int[5];

		System.out.print("商品 1 を入力してください:>");
		itemNames[0] = reader.readLine();

		System.out.print("商品 2 を入力してください:>");
		itemNames[1] = reader.readLine();

		System.out.print("商品 3 を入力してください:>");
		itemNames[2] = reader.readLine();

		System.out.print("商品 4 を入力してください:>");
		itemNames[3] = reader.readLine();

		System.out.print("商品 5 を入力してください:>");
		itemNames[4] = reader.readLine();

		System.out.println("各商品の単価を順に入力してください:");

		System.out.print(itemNames[0] + "の単価:>");
		prices[0] = Integer.parseInt(reader.readLine());

		System.out.print(itemNames[1] + "の単価:>");
		prices[1] = Integer.parseInt(reader.readLine());

		System.out.print(itemNames[2] + "の単価:>");
		prices[2] = Integer.parseInt(reader.readLine());

		System.out.print(itemNames[3] + "の単価:>");
		prices[3] = Integer.parseInt(reader.readLine());

		System.out.print(itemNames[4] + "の単価:>");
		prices[4] = Integer.parseInt(reader.readLine());

		System.out.println("\n登録商品一覧");
		System.out.println(itemNames[0] + ":" + prices[0] + "円");
		System.out.println(itemNames[1] + ":" + prices[1] + "円");
		System.out.println(itemNames[2] + ":" + prices[2] + "円");
		System.out.println(itemNames[3] + ":" + prices[3] + "円");
		System.out.println(itemNames[4] + ":" + prices[4] + "円");

		// TODO:ここに実装

	}

}
