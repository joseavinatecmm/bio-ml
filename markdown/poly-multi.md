# Machine Learning

**Author**: José Antonio Aviña Méndez

## Models for Predictive Analysis

* Simple Linear Regression
* Polynomial Regression
    * Quadratic Regression
* Multiple Regression

#### Quadratic Regression Model (QR)

$y = \beta_0 + \beta_1 x + \beta_2 x^2 + \epsilon$

---

$\hat{y} = \beta_0 + \beta_1 x + \beta_2 x^2 + \epsilon$

---


<div style="padding: 20px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green"> Machine Learning Capsule 2 </font = 5>
</div>

[Quadratic Regression](https://www.varsitytutors.com/hotmath/hotmath_help/topics/quadratic-regression)

---
<div style="padding: 20px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green"> Geometric Capsule 1</font = 5>
</div>

[Parable Parameters](https://www.geogebra.org/m/SdyQ7yBe)

---
### Learning Process (i.e. optmization)

Given the Loss Function $\mathcal{E}$:

$\mathcal{E}=\sum\limits_{i=1}^n (y_i-\hat{y_i})^2$

$\mathcal{E}=\sum\limits_{i=1}^n [y_i-( \beta_0 + \beta_1 x + \beta_2 x^2)]^2$

to minimize $\mathcal{E}$ w.r.t. each parameter:

$\frac{\partial \mathcal{E}}{\partial \beta_0} = 0; \ \frac{\partial \mathcal{E}}{\partial \beta_1} = 0; \ \frac{\partial \mathcal{E}}{\partial \beta_2}$ = 0;

$\vdots$

#### Matrix form of the SoLE for QR

$\Large{
\begin{bmatrix}
n &   \sum\limits_{i=1}^n x_i & \sum\limits_{i=1}^n x^2_i\\  
\sum\limits_{i=1}^n x_i & \sum\limits_{i=1}^n x^2_i & \sum\limits_{i=1}^n x^3_i \\
\sum\limits_{i=1}^n x^2_i & \sum\limits_{i=1}^n x^3_i & \sum\limits_{i=1}^n x^4_i \\
\end{bmatrix}  
\begin{bmatrix}
\beta_0\\
\beta_1 \\
\beta_2
\end{bmatrix}
=\begin{bmatrix}
\sum\limits_{i=1}^n y_i\\
\sum\limits_{i=1}^n x_iy_i\\
\sum\limits_{i=1}^n x^2_iy_i
\end{bmatrix}}
$



#### Polynomial Regression Model (PR)

---
<div style="padding: 20px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green"> Machine Learning Capsule 3 </font = 5>
</div>

[Polynomial Regression](https://gbhat.com/machine_learning/polynomial_regression_fit.html)

---


$
\begin{bmatrix}
n & \sum\limits_{i=1}^n x_i & \sum\limits_{i=1}^n x_i^2 & \cdots & \sum\limits_{i=1}^n x_i^m \\
\sum\limits_{i=1}^n x_i & \sum\limits_{i=1}^n x^2_i & \sum\limits_{i=1}^n x^3_i & \cdots & \sum\limits_{i=1}^n x_i^{m+1}  \\
\sum\limits_{i=1}^n x^2_i & \sum\limits_{i=1}^n x^3_i & \sum\limits_{i=1}^n x^4_i & \cdots & \sum\limits_{i=1}^n x_i^{m+2} \\
\sum\limits_{i=1}^n x^m_i & \sum\limits_{i=1}^n x^{m+1}_i & \sum\limits_{i=1}^n x^{m+2}_i & \cdots & \sum\limits_{i=1}^n x_i^{2m} 
\end{bmatrix}  
\begin{bmatrix}
\beta_0\\
\beta_1 \\
\beta_2 \\
\vdots \\
\beta_m \\
\end{bmatrix}
=\begin{bmatrix}
\sum\limits_{i=1}^n y_i\\
\sum\limits_{i=1}^n x_iy_i \\
\sum\limits_{i=1}^n x^2_iy_i \\
\vdots \\
\sum\limits_{i=1}^n x^m_iy_i
\end{bmatrix}
$


### Matrix Form for PR Model

$
\begin{aligned}
& y=X \beta+e \\
& {\underbrace{\left[\begin{array}{c}
y_1 \\
y_2 \\
\vdots \\
y_n
\end{array}\right]}_y=\underbrace{\left[\begin{array}{ccccc}
1 & x_1 & x_1^2 & \ldots & x_1^m \\
1 & x_2 & x_2^2 & \ldots & x_2^m \\
& & \vdots & \\
1 & x_i & x_i^2 & \ldots & x_i^m
\end{array}\right]}_X \underbrace{\left[\begin{array}{c}
\beta_0 \\
\beta_1 \\
\vdots \\
\beta_n
\end{array}\right]}_\beta+\underbrace{\left[\begin{array}{c}
e_1 \\
e_2 \\
\vdots \\
e_n
\end{array}\right]}_{\mathcal{E}}} \\
&
\end{aligned}
$

Given the following Loss Function:

$\mathcal{E}=\sum\limits_{i=1}^n (y_i-\hat{y_i})^2$

then **build the Ordinary Least Estimator**:


$\mathcal{E}=\sum\limits_{i=1}^n (y_i-\hat{y_i})^2$



$\mathcal{E}=\sum\limits_{i=1}^n e_i^2$

$[e_1, e_2, \ldots e_n]^T[e_1, e_2, \ldots e_n]$

$e=(y_i - \hat{y}_i)^2$

Given that:

$y = X \beta + e$

then:

$e = y -X\beta$

$\mathcal{E} = (y-X\beta)^T(y-X\beta)$

$\frac{\partial \mathcal{E}}{\partial \beta} = (y-X\beta)^T(y-X\beta)$

First, let us simplify the expression:

$\rightarrow (y-X\beta)^T(y-X\beta)$

$\rightarrow (y^T-X^T\beta^T)(y-X\beta)$

$\frac{\partial \mathcal{E}}{\partial \beta} =  y^Ty - y^TX\beta - X^T\beta^Ty + X^T\beta^TX\beta$


$\frac{\partial \mathcal{E}}{\partial \beta} =  y^Ty - (y^TX\beta)^T - X^T\beta^Ty + X^T\beta^TX\beta$

$\frac{\partial \mathcal{E}}{\partial \beta} =  0  - 2X^T\beta^Ty + X^T\beta^TX\beta$


$\frac{\partial \mathcal{E}}{\partial \beta} =  0  - 2X^Ty + 2X^TX\beta$


$\rightarrow - 2X^Ty + 2X^TX\beta =0$

$\rightarrow - X^Ty + X^TX\beta =$

$\rightarrow X^TX\beta = X^Ty$

$\Large{\beta = (X^TX)^{-1} X^Ty}$



## Multiple Linear Regression Model (MLR)

$y = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + \epsilon$

---

$\hat{y} = \beta_0 + \beta_1 x_1 + \beta_2 x_2 + \epsilon$

---
<div style="padding: 20px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green"> Machine Learning Capsule 4 </font = 5>
</div>

[Multiple Linear Regression](https://medium.com/analytics-vidhya/multiple-linear-regression-an-intuitive-approach-f874f7a6a7f9)

[Data Set Example](https://www.kaggle.com/datasets/abhishek14398/50startups)

---

### Learning Process (i.e. optmization)

Given the **Ordinary Least Squares Estimator**:



