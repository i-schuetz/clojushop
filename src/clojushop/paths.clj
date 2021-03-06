(ns clojushop.paths)

(def products "/products")
(def products-get products)
(def product-add (str products "/add"))
(def product-edit (str products "/edit"))
(def product-remove (str products "/remove"))

(def cart "/cart")
(def cart-get cart)
(def cart-add (str cart "/add"))
(def cart-remove (str cart "/remove"))
(def cart-quantity (str cart "/quantity"))

(def user "/user")
(def user-get user)
(def user-register (str user "/register"))
(def user-edit (str user "/edit"))
(def user-login (str user "/login"))
(def user-logout (str user "/logout"))
(def user-remove (str user "/remove"))

(def pay "/pay")
