import sys
from rich import print
from time import sleep

def tiktok():
    lines = [
        ("I wanna da-", 0.086),
        ("I wanna dance in the lights", 0.090),
        ("I wanna ro-", 0.086),
        ("I wanna rock your body", 0.090),
        ("I wanna go", 0.086),
        ("I wanna go for a ride", 0.090),
        ("Hop in the music and", 0.070),
        ("Rock your body", 0.08),
        ("Rock that body", 0.069),
        ("Come on, come on", 0.035),
        ("Rock that body", 0.05),
        ("(Rock your body)", 0.03),
        ("Rock that body", 0.049),
        ("Come on, come on", 0.035),
        ("Rock that body", 0.08),
    ]
    
    for text, delay in lines:
        for char in text:
            print(char, end="")
            sys.stdout.flush()
            sleep(delay)
        print()
    
tiktok()