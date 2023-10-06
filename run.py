import os
fileList=os.listdir()
fileList.sort()
for file in fileList:
    if file.startswith("_") and file.endswith(".class"):
        runName=file.replace(".class","")
        print(f"java {runName}")
        os.system(f"java {runName}")
        input("\n")
        os.system("cls")