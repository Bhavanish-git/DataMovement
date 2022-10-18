INSERT INTO users (username , password , enabled)
values ('admin' , 'admin' , true );

INSERT INTO users (username , password , enabled)
values ('mentor' , 'mentor' , true );

INSERT INTO authorities (username , authority)
values ('admin' , 'ROLE_ADMIN');

INSERT INTO authorities (username , authority)
values ('mentor' , 'ROLE_MENTOR');