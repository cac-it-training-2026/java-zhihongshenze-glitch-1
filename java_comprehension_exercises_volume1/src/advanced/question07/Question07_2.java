package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		int[] amount = new int[5];

		int sum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < amount.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			amount[i] = Integer.parseInt(reader.readLine());

		}

		for (int i = 0; i < 5; i++) {

			System.out.println(itemNames[i] + ":" + (prices[i] * amount[i]) + "円");
			sum += (prices[i] * amount[i]);

		}

		System.out.println("合計金額：" + sum + "円");
		// TODO: 実装ここから

	}
}
