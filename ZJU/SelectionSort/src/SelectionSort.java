import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SelectionSort
{

	private int length = 0;
	private int[] list;
	Scanner input = new Scanner(System.in);

	SelectionSort()
	{
		System.out.printf("请输入数组长度:");
		length = input.nextInt();
		this.list = new int[length];
		in();
	}

	SelectionSort(int length)
	{
		this.length = length;
		this.list = new int[length];
		in();
	}

	SelectionSort(int[] list)
	{
		this.length = list.length;
		this.list = new int[length];
		System.arraycopy(list, 0, this.list, 0, list.length);

	}

	void in()
	{
		for (int i = 0; i < length; i++)
		{
			System.out.printf("请输入第%d个元素:", i + 1);
			list[i] = input.nextInt();
		}
	}

	static void swap(@NotNull int[] list, int pos1, int pos2)
	{
		int t = list[pos1];
		list[pos1] = list[pos2];
		list[pos2] = t;

	}

	void sort()
	{
		for (int i = 0; i < length - 1; i++)
		{
			int flag = i;
			for (int j = i + 1; j < length; j++)
			{
				if (list[flag] > list[j])
				{
					flag = j;
				}
			}
			swap(this.list, i, flag);
		}
	}

	private void out()
	{
		System.out.println("输出数组");
		for (var i : list)
		{
			System.out.printf("%d   ", i);
		}
	}

	public static void main(String[] args)
	{
		int[] l = new int[10];
		for (int i=0;i<10; i++)
		{
			l[i] = (int) (1 + Math.random() * (20 - 1 + 1));
		}

		SelectionSort selectionSort = new SelectionSort(l);
		selectionSort.out();
		selectionSort.sort();
		selectionSort.out();


	}
}
