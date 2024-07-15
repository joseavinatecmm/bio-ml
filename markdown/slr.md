# Machine Learning

## Predictive Analysis

**Author:** José Antonio Aviña Méndez

## Simple Linear Regression Model

$y= \beta_0 + \beta_1 x + \epsilon$

$y_i= \beta_0 + \beta_1 x_i + \epsilon_i$

## Regression Line

$\hat{y}= \beta_0 + \beta_1 x + \epsilon$

## The loss function $\mathcal{E}$ 


$\mathcal{\mathcal{E}}=\sum\limits_{i=1}^n (y_i- \hat{y}_i)^2$

## To minize the $\mathcal{E}$ w.r.t $\beta_0$

$\frac{\mathcal{\partial E}}{\partial \beta_0} = 0$

$\frac{\mathcal{\partial E}}{\partial \beta_0} = \sum\limits_{i=1}^n [y_i- (\beta_0 + \beta_1 x_i )]^2$

$\frac{\mathcal{\partial E}}{\partial \beta_0} = \sum\limits_{i=1}^n [y_i- (\beta_0 + \beta_1 x_i )]^2$


$\frac{\mathcal{\partial E}}{\partial \beta_0} = 2 \sum\limits_{i=1}^n [y_i- (\beta_0 + \beta_1 x_i )]^{(2-1)} \cdot f(\beta)'$


$\frac{\mathcal{\partial E}}{\partial \beta_0} = 2 \sum\limits_{i=1}^n [y_i- (\beta_0 + \beta_1 x_i )]^{(2-1)} \cdot (-1)$


$\frac{\mathcal{\partial E}}{\partial \beta_0} = 2 \sum\limits_{i=1}^n (-y_i + \beta_0 + \beta_1 x_i)$


$2\sum\limits_{i=1}^n (-y_i + \beta_0 + \beta_1 x_i) = 0$


$\sum\limits_{i=1}^n (-y_i + \beta_0 + \beta_1x_i) = 0$


$- \sum\limits_{i=1}^n y_i + \beta_0 \sum\limits_{i=1}^n + \beta_1 \sum\limits_{i=1}^nx_i = 0$


$\beta_0 \sum\limits_{i=1}^n + \beta_1 \sum\limits_{i=1}^nx_i = \sum\limits_{i=1}^n y_i$

$\sum\limits_{i=1}^n = 1+1+\ldots + 1 = n$

$1. \ \ n \beta_0  + \beta_1 \sum\limits_{i=1}^nx_i = \sum\limits_{i=1}^n y_i$

## To minize the $\mathcal{E}$ w.r.t $\beta_1$

$\frac{\mathcal{\partial E}}{\partial \beta_1} = 0$


$\frac{\mathcal{\partial E}}{\partial \beta_1} = \sum\limits_{i=1}^n [y_i- (\beta_0 + \beta_1 x_i)]^2$

$\left(\frac{d}{d\beta} f(\beta)^n \rightarrow nf(\beta)^{n-1} f(\beta)' \right)$ 


$\frac{\mathcal{\partial E}}{\partial \beta_1} = \ \ \ldots$ 

$\vdots$

$2. \ \ \beta_0 \sum\limits_{i=1}^n x_i  + \beta_1 \sum\limits_{i=1}^nx^2_i = \sum\limits_{i=1}^n x_iy_i$

<br /> 
<br /> 

## System of Linear Equations (SoLE) 


$\Large{1. \ n \beta_0  + \beta_1 \sum\limits_{i=1}^nx_i = \sum\limits_{i=1}^n y_i}$

$\Large{2. \ \beta_0 \sum\limits_{i=1}^n x_i  + \beta_1 \sum\limits_{i=1}^nx^2_i = \sum\limits_{i=1}^n x_iy_i}$

## The  Matrix Notation of the SoLE

$\Large{
\begin{bmatrix}
n &   \sum\limits_{i=1}^n x_i \\
\sum\limits_{i=1}^n x_i & \sum\limits_{i=1}^n x^2_i
\end{bmatrix}  
\begin{bmatrix}
\beta_0\\
\beta_1
\end{bmatrix}
=\begin{bmatrix}
\sum\limits_{i=1}^n y_i\\
\sum\limits_{i=1}^n x_iy_i
\end{bmatrix}}
$

## Cramer ($2\times2$)

$D_s=?, D_{\beta_1}=?, \beta_1= \frac{D_{\beta1}}{D_s}$


$D_s = n \sum\limits_{i=1}^n x^2_i - [\sum\limits_{i=1}^n x_i]^2$

$D_{\beta_1} = n \sum\limits_{i=1}^n x_i y_i- \sum\limits_{i=1}^n x_i \sum\limits_{i=1}^n y_i$

## SLR Algorithm for Predictive Analysis

$\Large{3. \ \beta_0 = \frac{\sum\limits_{i=1}^n y_i- \beta_1 \sum\limits_{i=1}^nx_i}{n}}$

$\Large{4. \ \ \beta_1 = \frac{n \sum\limits_{i=1}^n x_i y_i- \sum\limits_{i=1}^n x_i \sum\limits_{i=1}^n y_i }{ n \sum\limits_{i=1}^n x^2_i - [\sum\limits_{i=1}^n x_i]^2}}$

<br /> 
<br />
It follows from Eq.(3) that: 

$5. \ \ \Large{\beta_0 =\bar{y}- \beta_1 \bar{x}}$

$\ldots$ and, finally, have a look at this other alternative for getting $\beta_0$:


$6. \ \ \Large{\beta_0 = \frac{\sum\limits_{i=1}^n x^2 \sum\limits_{i=1}^n y_i- \sum\limits_{i=1}^n x_i \sum\limits_{i=1}^n x_iy_i}{ n \sum\limits_{i=1}^n x^2_i - [\sum\limits_{i=1}^n x_i]^2}}$

... by the way, this last Eq.(6) is the solution for your **Challenge 1**, the one I defined in our Google Classroom (Bio-inspired Machine Learning).

[Finally, let us compare this last Eq.(6) with the one proposed in the tutorial: "How to Create Your Own Simple Linear Regression Equation".](https://owlcation.com/stem/How-to-Create-a-Simple-Linear-Regression-Equation).

---
<div style="padding: 30px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green">Machine Learning Capsule 1 </font = 5>
</div>

---

## Predicting with the Regression Line
Once we get the first **Learning Model**, let us evaluate it:


$\Large{sales = 167.683 + 23.4228 \ advertising}$

### ¿How good is our Learning Model? $R^2$

**R^2** $= 0.976 = 97.6\%$ 

**adjust-R** $= 0.973 = 97.3\%$ 

### Let us make some predictions


$\Large{sales = 167.683 + 23.4228 \ (60) = \ ? }$

$\Large{sales = 167.683 + 23.4228 \ (70) = \ ? }$

$\Large{sales = 167.683 + 23.4228 \ (45) = \ ? }$

---
<div style="padding: 30px; border: 1px solid transparent; border-color: transparent; margin-bottom: 20px; border-radius: 4px; color: #3c763d; background-color: #dff0d8; border-color: #d6e9c6;">
<font size= 5 face="verdana " color="green"> Wolfram Alpha: Best fit</font = 5>
</div>

---

## Simple Linear Regression by Gradient Descent

Demo:
[GD-based Regression](https://miro.medium.com/v2/resize:fit:1116/format:webp/1*iB5TFe77kfkWIxzcLT92Wg.gif)
