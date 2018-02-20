# script to convert doc/docx files to pdf in python

import os
import sys
import comtypes.client

wdFormatPDF = 17

WORD_FILE_NAME = 'Abstract.docx'
PDF_FILE_NAME = 'Abstract_Converted.pdf'


in_file = os.path.abspath(WORD_FILE_NAME)
out_file = os.path.abspath(PDF_FILE_NAME)

print('Converting.. Please Wait..!!')

word = comtypes.client.CreateObject('Word.Application')
doc = word.Documents.Open(in_file)
doc.SaveAs(out_file, FileFormat=wdFormatPDF)
doc.Close()
word.Quit()

print('Finished..!!!')

