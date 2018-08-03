using System;
using AcademiaCodigo.Web.DataAccess;
using AcademiaCodigo.Web.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace AcademiaCodigo.Web {
    public class ProductController : Controller {
        public IActionResult Index () {

            return View ();
        }

        public IActionResult Search (IFormCollection valueCollection) {

            string code = valueCollection["i_code"];
            string name = valueCollection["i_name"];

            return Search (new ProductSearchQueryModel () {
                Code = code,
                    Name = name,
                    Page = 0
            });
        }
        private IActionResult Search (ProductSearchQueryModel viewParams) {

            ProductManagement pm = new ProductManagement ();
            var apiProduct = pm.Search (viewParams.Code, viewParams.Name, null, null, null, viewParams.Page * 10, 10);

            ProductViewModel model = new ProductViewModel () {
                Products = apiProduct,
                Filter = viewParams
            };

            return View ("Search", model);
        }
        public IActionResult Navigate (bool Next, int page, string code, string name) {
            int nextPage = page;
            if (Next == true) {
                nextPage++;
            } else {
                if (page > 0) {
                    nextPage--;
                }
            }
            return Search (new ProductSearchQueryModel () {
                Code = code,
                    Name = name,
                    Page = nextPage
            });
        }

        public IActionResult Detail (string code) {
            ProductManagement pm = new ProductManagement ();
            ProductModel product = pm.Get (code);

            return View (product);
        }

        public IActionResult Edit (IFormCollection valueCollection) {

            //chamra o 

            string code = valueCollection["i_code"];
            string name = valueCollection["i_name"];
            string priceStr = valueCollection["i_price"];
            string description = valueCollection["i_description"];
            string idStr = valueCollection["i_id"];
            string versionStr = valueCollection["i_version"];

            try {
                //converter a string do preço para um objecto do tipo decimal
                Decimal price = 0;
                Decimal.TryParse (priceStr, out price);

                Guid version = Guid.Empty;
                Guid.TryParse (versionStr, out version);

                long id = 0;
                long.TryParse (idStr, out id);

                ProductManagement pm = new ProductManagement ();
                UpdateProductModel model = new UpdateProductModel () {

                    Code = code,
                    Name = name,
                    Price = price,
                    Description = description,
                    Version = version

                };

                UpdateProductResultModel result = pm.Update (id, model);
                //ProductModel product = pm.Get (code);
                //return View("Detail", product);

            } catch (Exception ex) {

                return new ContentResult () {
                    Content = "An error ocurred" + Environment.NewLine + ex.Message

                };

            }
            //Fixme
            return RedirectToAction ("Search");
        }

        [HttpGet]

        public IActionResult Create () {

            return View ("Create");
        }

        [HttpPost]
        public IActionResult Create (IFormCollection valueCollection) {

            string code = valueCollection["i_code"];
            string name = valueCollection["i_name"];
            string priceStr = valueCollection["i_price"];
            string description = valueCollection["i_description"];
               

            try {
                Decimal price = 0;
                Decimal.TryParse (priceStr, out price);

                ProductManagement pm = new ProductManagement ();
                CreateProductModel model = new CreateProductModel () {

                    Code = code,
                    Name = name,
                    Price = price,
                    Description = description,
                    CreatedOn = DateTimeOffset.Now,
                    CreatedBy = User.Identity.Name,
                    UpdatedOn = DateTimeOffset.Now,
                    UpdatedBy = User.Identity.Name,
                   
                };

                CreateProductResultModel product = pm.Create (model);

            } catch (Exception ex) {

                return new ContentResult () {
                    Content = "An error ocurred" + Environment.NewLine + ex.Message

                };

            }

            return RedirectToAction ("Search", new {code=code});

        }
    }
}