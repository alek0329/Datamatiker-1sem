-- a
-- insert into actor (first_name,last_name) Values ("Aleksander", "Rolander");
-- insert into film_actor (actor_id,film_id) values (201,48);
-- insert into film_actor (actor_id,film_id) values (201,105);
-- insert into film_actor (actor_id,film_id) values (201,106);
-- insert into film_actor (actor_id,film_id) values (201,38);
-- insert into film_actor (actor_id,film_id) values (201,28);

-- UPDATE actor SET first_name="Romeo Ditlev", last_name="Gåde" WHERE actor_ID=201;
-- DELETE from film_actor WHERE actor_id = 201;
-- DElete from film_actor where actor_id = 202;

delete from actor where actor_id = 201;
delete from actor where actor_id = 202;