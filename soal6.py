import pandas as pd

data = [
    ['Agus',8000000,'Junior Officer','Semarang'],
    ['Dina',15000000,'Ass Manager','Bandung'],
    ['Joko',25000000,'Manager','Jakarta'],
    ['Ahmad',13000000,'Middle Officer','Jakarta'],
    ['Felicia',12500000,'Middle Officer','Bandung'],
]

#jawaban a
newdata = data
for i in newdata:
  if i[1] >= 15000000:
    i[1] = i[1]+ i[1]*10/100
  elif i[1] >=100000:
    i[1] = i[1]+ i[1]*12/100
  else:
    i[1] = i[1]+ i[1]*15/100
#print(newdata)

#jawaban b
for i in newdata:
  if i[3]=='Jakarta':
    i[1] = i[1] - i[1]*25/1000
  elif i[3]=='Bandung':
    i[1] = i[1] - i[1]*20/1000
  else:
    i[1] = i[1] - i[1]*18/1000
#print(newdata)

#jawaban c
for i in newdata:
  if i[2]=='Manager':
    i[1] = i[1] + 250000
  elif i[2]=='Ass Manager':
    i[1] = i[1] + 175000
  elif i[2]=='Senior Officer':
    i[1] = i[1] + 150000
  elif i[2]=='Middle Officer':
    i[1] = i[1] + 125000
  elif i[2]=='Junior Officer':
    i[1] = i[1] + 100000
#print(newdata)

df = pd.DataFrame(newdata)
df = df.drop(df.columns[3], axis=1)
df = df.drop(df.columns[2], axis=1)
print(df)
