#method 1 to read
#jad = open('text.txt')
#print(jad.read())
#jad.close()

#method 2 to read 
with open('text.txt') as jad :
    content =jad.readlines()    #readlines is used to read it as list
    reversed(content)
# method to write 
    with open('text.txt','w')  as daj:
        for line in reversed(content):
             daj.write(line)