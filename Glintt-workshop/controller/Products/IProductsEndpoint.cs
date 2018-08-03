using System.Collections.Generic;
using Glintt_workshop.Controllers.Products;
using Microsoft.AspNetCore.Mvc;

namespace Glintt_workshop.controller.products
{
    public interface IProductsEndpoint
    {
        IReadOnlyCollection<ProductSearchItemModel> Search(
            string code, string name, decimal? minPrice, decimal? maxPrice, bool? isActive, int skip = 0, int take = 20);

        IActionResult Create(CreateProductModel model);


        IActionResult Get(string code);

        IActionResult Update ( long id, UpdateProductModel model);

        IActionResult Deactivate (long ide, DeactivateProductModel model);

        IActionResult Activate (long ide, ActivateProductModel model);

    }




}
