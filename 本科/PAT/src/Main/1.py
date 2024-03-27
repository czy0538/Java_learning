    n=(int)input();
    ll num[n][3];
    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < 3; ++j)
        {
            cin >> num[i][j];
        }
    }
    for (int i = 0; i < n; i++)
    {
        ll temp[3];
        for (int j = 0; j < 3; j++)
        {
            temp[j] = num[i][j];
        }
        if (temp[0] + temp[1] > temp[2])
        {
            cout << "Case #" << i + 1 << ": true" << endl;
        }
        else
        {
            cout << "Case #" << i + 1 << ": false" << endl;
        }
    }
    return 0;
}