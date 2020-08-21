INSERT INTO CUSTOMER(id,user_name, password, token) values (1,'gigi','Test1234','12324344444')
ON CONFLICT(user_name) DO NOTHING;