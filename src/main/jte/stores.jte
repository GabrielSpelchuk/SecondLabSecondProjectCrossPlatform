@import com.example.SecondLab.models.Store
@import java.util.List

@param List<Store> stores

<!DOCTYPE html>
<html>
<head>
    <title>Stores</title>
</head>
<body>
<h1>List of Stores</h1>
<ul>
    @for(Store store : stores)
    <li>
        <strong>${store.getName()}</strong> (${store.getLocation()})
    </li>
    @endfor
</ul>
</body>
</html>
