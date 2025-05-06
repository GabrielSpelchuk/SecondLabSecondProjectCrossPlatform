@import com.example.SecondLab.models.Product
@import java.util.List

@param List<Product> products

<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>All Products</h1>
<ul>
    @for(Product product : products)
    <li>
        ${product.getName()} - $${product.getPrice()}
        (Store: ${product.getStore().getName()})
    </li>
    @endfor
</ul>
</body>
</html>
