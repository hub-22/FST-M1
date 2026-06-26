import pandas as pd
from pandas import ExcelWriter

# Create a dictionary
data = {
    'FirstName': ["Satvik", "Avinash", "Lahri"],
    'LastName': ["Shah", "Kati", "Rath"],
    'Email': ["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber': ["4537829158", "4892184058", "4528727830"]
}

# Create DataFrame
df = pd.DataFrame(data)

# Write to Excel
with ExcelWriter('contacts.xlsx') as writer:
    df.to_excel(writer, sheet_name='Contacts', index=False)

print("Excel file created successfully!")