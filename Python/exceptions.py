#exceptions method 1
gaming = 5

#if gaming != 4:
 #   raise Exception("gaming not equal to five")

#exceptions method 2
#assert(gaming ==4) # raising error if false

# TRY AND CATCH MECHANISIM
try:
    with open('texxt.txt') as fam:
        fam.read()       
except Exception as g:
    print(g)
finally:
    print("Done")