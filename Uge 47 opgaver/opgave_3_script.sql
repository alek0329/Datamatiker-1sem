select * from film join (film_category join category on film_category.category_id=category.category_id) on film.film_id = film_category.film_id where category.name = "Horror";
