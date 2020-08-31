INSERT INTO CUSTOMER(id,user_name, password, token) values (1,'gigi','Test1234','12324344444')
ON CONFLICT(user_name) DO NOTHING;

INSERT INTO MOVIE(id,name,category) values (1,'Titanic','Romance')
ON CONFLICT(id) DO NOTHING;
INSERT INTO MOVIE(id,name,category) values (2,'A Star Is Born','Romance')
ON CONFLICT(id) DO NOTHING;
INSERT INTO MOVIE(id,name,category) values (3,'The Best of Me','Romance')
ON CONFLICT(id) DO NOTHING;
INSERT INTO MOVIE(id,name,category) values (5,'The Adjustment Bureau','Thriller')
ON CONFLICT(id) DO NOTHING;
INSERT INTO MOVIE(id,name,category) values (6,'The 40-Year-Old Virgin','Comedy')
ON CONFLICT(id) DO NOTHING;
INSERT INTO MOVIE(id,name,category) values (7,'The Hangover','Comedy')
ON CONFLICT(id) DO NOTHING;