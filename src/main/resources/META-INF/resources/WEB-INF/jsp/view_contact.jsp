<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <style>
            #customers {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }
            
            #customers td,
            #customers th {
                border: 1px solid #ddd;
                padding: 8px;
            }
            
            #customers tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            
            #customers tr:hover {
                background-color: #ddd;
            }
            
            #customers th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
            }
            
            #submit1 {
                padding: 10px 15px;
            }
            
            #submit2 {
                padding: 10px 15px;
            }
            
            #phoneNumber1 {
                padding: 10px 15px;
            }
            
            #phoneNumber2 {
                padding: 10px 15px;
            }
        </style>
    </head>

    <body style="background-color: #E6E6FA">
        <form action="editcontact" id='editContact' name='editform'>
            <table>
                <tr>
                    <th><label for="mobile">Enter Phone Number:</label></th>
                    <th> <input type='text' name='phoneNumber' size="40" id='phoneNumber1' class="required" pattern="[6-9]{1}[0-9]{9}" min="10" max="10" title="Eneter valic number starts 6-9 and remaing 9 digit with 0-9" required></th>
                    <th> <button type='submit' value='submit' id="submit1" style="background-color: #008CBA" href="allcontacts">Edit Contact</button></th>
                </tr>
            </table>
        </form>
        <form action="deletecontact" id='deleteContact' name='deleteform'>
            <table>
                <tr>
                    <th><label for="mobile">Enter Phone Number:</label></th>
                    <th> <input type='text' name='phoneNumber' size="40" id='phoneNumber2' class="required" pattern="[6-9]{1}[0-9]{9}" min="10" max="10" title="Eneter valic number starts 6-9 and remaing 9 digit with 0-9" required></th>
                    <th> <button type='submit' value='submit' id="submit2" style="background-color: #008CBA">Delete Contact</button></th>
                    <th><a button style='margin-left: 10px;' type='submit' value='submit' id="submit1" href="/">Home</button></a></th>
                </tr>
            </table>
        </form>


        <table id="customers">
            <thead>
                <tr>
                    <th width="20%">First Name</th>
                    <th width="20%">Last Name</th>
                    <th width="20%">Email Address</th>
                    <th width="20%">Phone Number</th>
                    <th width="12%">Status</th>
                </tr>
            </thead>
            <tbody id="tableData"></tbody>
        </table>
        <script type="text/javascript">
            var mainObj = ${contact};
            //var mainObj = "<c:out value='${contact}'/>";
            //console.log('${contactList}');
            var k = '<tbody>'
            for (i = 0; i < mainObj.length; i++) {
                k += '<tr>';
                k += '<td>' + mainObj[i].firstName + '</td></span>';
                k += '<td>' + mainObj[i].lastName + '</td></span>';
                k += '<td>' + mainObj[i].emailId + '</td></span>';
                k += '<td>' + mainObj[i].phoneNumber + '</td></span>';
                k += '<td>' + mainObj[i].contactStatus + '</td></span>';
                k += '</tr>';
            }
            k += '</tbody>';
            document.getElementById('tableData').innerHTML = k;
        </script>


    </body>
  </html>
