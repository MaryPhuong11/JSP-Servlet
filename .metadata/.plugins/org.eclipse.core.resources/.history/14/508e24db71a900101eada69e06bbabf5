<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${sessionScope.appLocale}" />
<fmt:setBundle basename="i18n.messages" />
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><fmt:message key="app.name"/></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <style>
        .hero-section {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            color: white;
        }
        .feature-card {
            background: white;
            border-radius: 15px;
            padding: 30px;
            text-align: center;
            box-shadow: 0 10px 30px rgba(0,0,0,0.1);
            transition: transform 0.3s ease;
            margin-bottom: 30px;
        }
        .feature-card:hover {
            transform: translateY(-10px);
        }
        .feature-icon {
            font-size: 3rem;
            margin-bottom: 20px;
        }
        .btn-hero {
            padding: 15px 40px;
            font-size: 1.2rem;
            border-radius: 50px;
            transition: all 0.3s ease;
        }
        .btn-hero:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        }
    </style>
</head>
<body>
    <!-- Hero Section -->
    <div class="hero-section">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6">
                    <h1 class="display-3 fw-bold mb-4">
                        <i class="fas fa-globe me-3"></i>
                        <fmt:message key="app.name"/>
                    </h1>
                    <p class="lead mb-5">
                        <fmt:message key="app.description"/>
                    </p>
                    <div class="d-grid gap-3 d-md-flex">
                        <a href="products" class="btn btn-warning btn-hero">
                        <i class="fas fa-rocket me-2"></i><fmt:message key="hero.startNow"/>
                        </a>
                        <a href="#features" class="btn btn-outline-light btn-hero">
                        <i class="fas fa-info-circle me-2"></i><fmt:message key="hero.learnMore"/>
                        </a>
                    </div>
                </div>
                <div class="col-lg-6 text-center">
                    <i class="fas fa-boxes" style="font-size: 15rem; opacity: 0.3;"></i>
                </div>
            </div>
        </div>
    </div>

    <!-- Features Section -->
    <div class="container py-5" id="features">
        <div class="row mb-5">
            <div class="col-12 text-center">
                <h2 class="display-4 fw-bold mb-3"><fmt:message key="features.title"/></h2>
                <p class="lead text-muted"><fmt:message key="features.subtitle"/></p>
            </div>
        </div>
        
        <div class="row">
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-language feature-icon text-primary"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.multilang.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.multilang.desc"/>
                    </p>
                </div>
            </div>
            
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-cogs feature-icon text-success"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.manage.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.manage.desc"/>
                    </p>
                </div>
            </div>
            
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-database feature-icon text-info"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.database.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.database.desc"/>
                    </p>
                </div>
            </div>
            
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-mobile-alt feature-icon text-warning"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.responsive.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.responsive.desc"/>
                    </p>
                </div>
            </div>
            
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-search feature-icon text-danger"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.search.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.search.desc"/>
                    </p>
                </div>
            </div>
            
            <div class="col-lg-4 col-md-6">
                <div class="feature-card">
                    <i class="fas fa-shield-alt feature-icon text-secondary"></i>
                    <h3 class="fw-bold mb-3"><fmt:message key="feature.security.title"/></h3>
                    <p class="text-muted">
                        <fmt:message key="feature.security.desc"/>
                    </p>
                </div>
            </div>
        </div>
    </div>

    <!-- Statistics Section -->
    <div class="bg-light py-5">
        <div class="container">
            <div class="row text-center">
                <div class="col-lg-3 col-md-6 mb-4">
                    <i class="fas fa-language fa-3x text-primary mb-3"></i>
                    <h3 class="fw-bold">5</h3>
                    <p class="text-muted"><fmt:message key="index.stats.languages"/></p>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <i class="fas fa-boxes fa-3x text-success mb-3"></i>
                    <h3 class="fw-bold">∞</h3>
                    <p class="text-muted"><fmt:message key="index.stats.manageable"/></p>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <i class="fas fa-tags fa-3x text-info mb-3"></i>
                    <h3 class="fw-bold">∞</h3>
                    <p class="text-muted"><fmt:message key="index.stats.categories"/></p>
                </div>
                <div class="col-lg-3 col-md-6 mb-4">
                    <i class="fas fa-users fa-3x text-warning mb-3"></i>
                    <h3 class="fw-bold">24/7</h3>
                    <p class="text-muted"><fmt:message key="index.stats.support"/></p>
                </div>
            </div>
        </div>
    </div>

    <!-- CTA Section -->
    <div class="py-5" style="background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);">
        <div class="container text-center text-white">
                <h2 class="display-4 fw-bold mb-4"><fmt:message key="ready.title"/></h2>
            <p class="lead mb-5"><fmt:message key="ready.subtitle"/></p>
            <a href="products" class="btn btn-warning btn-hero btn-lg">
                <i class="fas fa-arrow-right me-2"></i><fmt:message key="cta.goToSystem"/>
            </a>
        </div>
    </div>

    <!-- Footer -->
    <footer class="bg-dark text-white py-4">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <h5><i class="fas fa-globe me-2"></i><fmt:message key="footer.title"/></h5>
                    <p class="text-muted"><fmt:message key="footer.subtitle"/></p>
                </div>
                <div class="col-md-6 text-end">
                    <p class="text-muted mb-0">
                        <i class="fas fa-code me-2"></i><fmt:message key="footer.builtWith"/>
                    </p>
                </div>
            </div>
        </div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>