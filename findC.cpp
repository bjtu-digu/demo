#include<stdio.h>
#include<string.h>
char str[1000];
int main()
{
	int ans = 0;
	int l;
	bool boo;
	int tot = 0;
	freopen("C.in","r",stdin);
	while(1)
	{
		int now = 0;
		gets(str);
		l = strlen(str);
		boo = str[0] == '4' && str[1] == ' ';
		for (int i = 0; i < l; ++i)
		{
			if(str[	i] == ' ') now++;
		}
		if(now == 3 && boo) tot++;
		if(tot == 157) 
		{
			printf("%d\n", ans);
			return 0;
		}
		ans++;
	}
}