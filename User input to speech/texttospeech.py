# importing gTTS
from gtts import gTTS
# importing os for saving and playing audio
import os

# reading input from user
myText = input("Enter the text : ")

# setting language
language = "en"

# invoking gTTS to convert text to speech
myObj = gTTS(text=myText, lang=language, slow=False)

# saving generated audio
myObj.save("audio-file.mp3")

# playing audio file
os.system("audio-file.mp3")
