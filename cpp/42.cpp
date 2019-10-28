    #include <bits/stdc++.h>
    #define fastIO ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0)
    using namespace std;
    typedef long long ll;
    template <class ll>
    void fastscan(ll &number)
    {
        //variable to indicate sign of input number
        bool negative = false;
        register ll c;
     
        number = 0;
     
        // extract current character from buffer
        c = getchar_unlocked();
        if (c=='-')
        {
            // number is negative
            negative = true;
     
            // extract the next character from the buffer
            c = getchar_unlocked();
        }
     
        // Keep on extracting characters if they are integers
        // i.e ASCII Value lies from '0'(48) to '9' (57)
        for (; (c>47 && c<58); c=getchar_unlocked())
            number = number *10 + c - 48;
     
        // if scanned input has a negative sign, negate the
        // value of the input number
        if (negative)
            number *= -1;
    }
     
    // Function Call
    int main()
    {
        fastIO;
        while (true)
        {
            ll n;
            fastscan(n);
            if (n==42)
                break;
            else
                cout<<n<<"\n";
        }
    }
     