font-family: 'Roboto', sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f0f0f0;
}

.navbar {
    position: fixed;
    width: 100%;
    background-color: #0044cc;
    padding: 15px 0;
    top: 0;
    left: 0;
    z-index: 1000;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

.nav-menu {
    list-style: none;
    display: flex;
    justify-content: center;
    margin: 0;
    padding: 0;
}

.nav-item {
    margin: 0 20px;
}

.nav-link {
    text-decoration: none;
    color: white;
    font-size: 18px;
    padding: 8px 15px;
    border-radius: 5px;
    transition: background-color 0.3s, color 0.3s, transform 0.3s;
}

.nav-link:hover {
    background-color: #ffffff;
    color: #0044cc;
    transform: scale(1.1);
}

.nav-link.active {
    background-color: #002a80;
}

section {
    padding: 100px 20px;
    margin-top: 80px;
}

#home {
    background-color: #bedef5;
    text-align: center;
}

#about {
    background-color: #bbdefb;
    text-align: center;
}

#products, #categories, #testimonials {
    background-color: #fff;
}

#categories {
    padding: 100px 20px;
    background-color: #eadfdf; /* Background color for the section */
}

.category-grid {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 20px;
}

.category-card {
    background-size: cover;
    background-position: center;
    color: #fff; /* Ensure text contrasts well with the background */
    padding: 20px;
    text-align: center;
    border-radius: 10px;
    overflow: hidden;
    position: relative;
}

.category-card h2 {
    font-size: 2em;
    margin-bottom: 10px;
}

.category-card p {
    font-size: 1.2em;
}

/* Additional styling for overlay and text contrast */
.category-card::before {
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5); /* Semi-transparent overlay */
    z-index: 1;
}

.category-card h2,
.category-card p {
    position: relative;
    z-index: 2;
}

/* Adjustments for responsiveness */
@media (max-width: 768px) {
    .category-grid {
        grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
    }
}


#contact {
    background-color: #e1f5fe;
}

section h1 {
    font-size: 2.5em;
    color: #0044cc;
    margin-bottom: 20px;
    text-align: center;
}

section p {
    font-size: 1.2em;
    color: #333;
    text-align: center;
    max-width: 800px;
    margin: 0 auto;
}

.product-grid, .category-grid, .testimonial-grid {
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    gap: 20px;
}
.product-card {
    background-color: white;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    padding: 20px;
    margin: 20px;
    text-align: center;
}

.product-card img {
    max-width: 100%;
    border-radius: 10px;
}

.product-card h2 {
    margin-top: 15px;
    font-size: 1.5em;
    color: #333;
}

.product-card p {
    font-size: 1em;
    color: #777;
}

.product-card button {
    background-color: #0044cc;
    color: white;
    border: none;
    padding: 10px 20px;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
}

.product-card button:hover {
    background-color: #002a80;
}


.product-card, .category-card, .testimonial-card {
    background-color: white;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    padding: 20px;
    text-align: center;
    width: 250px;
}

.product-card img {
    max-width: 100%;
    border-radius: 10px;
}

.product-card h2, .category-card h2, .testimonial-card h3 {
    margin-top: 15px;
    font-size: 1.5em;
    color: #333;
}

.product-card p, .testimonial-card p {
    font-size: 1em;
    color: #777;
}

.product-card button, .contact-form button {
    background-color: #0044cc;
    color: white;
    border: none;
    padding: 10px 20px;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
}

.product-card button:hover, .contact-form button:hover {
    background-color: #002a80;
}

.contact-form {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.contact-form label {
    font-size: 1em;
    color: #333;
    margin-bottom: 5px;
}

.contact-form input, .contact-form textarea {
    width: 100%;
    max-width: 500px;
    padding: 10px;
    margin-bottom: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 1em;
}

.contact-form textarea {
    height: 100px;
    resize: vertical;
}