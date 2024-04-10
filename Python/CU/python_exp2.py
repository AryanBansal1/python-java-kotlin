def amicable_number(a,b):
    Sum_a = 0
    Sum_b = 0
    for div_A in range(1,a):
        if a % div_A == 0:
            Sum_a +=div_A
    for div_B in range(1,b):
        if b % div_B == 0:
            Sum_b +=div_B
    
    if Sum_a ==b and Sum_b == a:
        print("These are Amicable Numbers")
    else:
        print("These are not Amicable Numbers")

amicable_number(1184,1210)